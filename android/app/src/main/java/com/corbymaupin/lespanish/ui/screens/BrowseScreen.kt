package com.corbymaupin.lespanish.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.corbymaupin.lespanish.ui.AppViewModel
import com.corbymaupin.lespanish.ui.theme.LEAccent
import com.corbymaupin.lespanish.ui.theme.LECard
import com.corbymaupin.lespanish.ui.theme.LEMuted

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun BrowseScreen(vm: AppViewModel) {
    val trade by vm.browseTrade.collectAsState()
    val trades by vm.trades.collectAsState()
    val cards by vm.browseCards.collectAsState()

    Column(Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Browse", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)
        Text("${cards.size} cards", color = LEMuted, fontSize = 13.sp)
        FlowRow(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            trades.forEach { t ->
                FilterChip(
                    selected = trade == t,
                    onClick = { vm.setBrowseTrade(t) },
                    label = { Text(t) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = LEAccent.copy(alpha = 0.25f),
                        selectedLabelColor = LEAccent
                    )
                )
            }
        }
        LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.fillMaxSize()) {
            items(cards, key = { it.id }) { c ->
                Row(
                    Modifier
                        .fillMaxWidth()
                        .background(LECard, RoundedCornerShape(12.dp))
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(Modifier.weight(1f)) {
                        Text(c.en, fontWeight = FontWeight.SemiBold)
                        Text(c.es, color = LEAccent)
                        if (c.region.isNotBlank()) {
                            Text(c.region, color = LEMuted, fontSize = 12.sp)
                        }
                    }
                    Text(
                        if (c.introduced) "B${c.box}" else "–",
                        color = LEMuted,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
            }
        }
    }
}
