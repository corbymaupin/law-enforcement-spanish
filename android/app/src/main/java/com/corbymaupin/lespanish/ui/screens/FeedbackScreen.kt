package com.corbymaupin.lespanish.ui.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.corbymaupin.lespanish.ui.theme.LEAccent
import com.corbymaupin.lespanish.ui.theme.LEMuted

private const val FEEDBACK_EMAIL = "james.corby.maupin@gmail.com"

@Composable
fun FeedbackScreen() {
    val context = LocalContext.current
    var message by remember { mutableStateOf("") }

    Column(
        Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Feedback", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)
        Text(
            "Tell Applied Solutions Lab what to fix or add. Opens your email app — nothing is sent until you hit send.",
            color = LEMuted,
            fontSize = 13.sp
        )
        OutlinedTextField(
            value = message,
            onValueChange = { message = it },
            modifier = Modifier.fillMaxWidth().weight(1f, fill = false).height(180.dp),
            placeholder = { Text("Your notes…") },
            label = { Text("Message") }
        )
        Spacer(Modifier.height(4.dp))
        Button(
            onClick = {
                val body = buildString {
                    appendLine(message.ifBlank { "(no message)" })
                    appendLine()
                    appendLine("---")
                    appendLine("App: Law Enforcement Spanish 1.0.0")
                    appendLine("Package: com.corbymaupin.lespanish")
                    appendLine("Developer: Applied Solutions Lab")
                }
                val uri = Uri.parse(
                    "mailto:$FEEDBACK_EMAIL" +
                        "?subject=" + Uri.encode("LE Spanish feedback") +
                        "&body=" + Uri.encode(body)
                )
                val intent = Intent(Intent.ACTION_SENDTO, uri)
                context.startActivity(Intent.createChooser(intent, "Send feedback"))
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = LEAccent)
        ) {
            Text("Email feedback", color = MaterialTheme.colorScheme.onPrimary, fontWeight = FontWeight.SemiBold)
        }
        Text("To: $FEEDBACK_EMAIL", color = LEMuted, fontSize = 12.sp)
    }
}
