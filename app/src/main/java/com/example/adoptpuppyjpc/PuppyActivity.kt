package com.example.adoptpuppyjpc

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.example.adoptpuppyjpc.ui.theme.PuppyTheme
import data.Puppy

class PuppyActivity : AppCompatActivity() {

    private val puppy: Puppy by lazy {
        intent.getSerializableExtra(PUPPY_ID) as Puppy
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PuppyTheme {
                PuppyScreen(puppy = puppy)
            }
        }
    }

    companion object {
        private const val PUPPY_ID = "puppy_id"
        fun newIntent(context: Context, puppy: Puppy) =
            Intent(context, PuppyActivity::class.java).apply {
                putExtra(PUPPY_ID, puppy)
            }
    }
}

