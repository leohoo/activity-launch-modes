package com.example.launchmodes

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment

class ActivityB : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ActivityB", "onCreate ${this.hashCode()}")
        setContent {
            Box(contentAlignment = Alignment.Center) {
                Text(text = "ActivityB")
            }
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d("ActivityB", "onNewIntent ${this.hashCode()}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityB", "onDestroy ${this.hashCode()}")
    }
}