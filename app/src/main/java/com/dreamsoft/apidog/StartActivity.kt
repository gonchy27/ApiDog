package com.dreamsoft.apidog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dreamsoft.apidog.ui.MainActivity
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        btn_start.setOnClickListener {
            val intent=Intent(this, MainActivity::class.java)
                startActivity(intent);
                finish();
        }
    }
}

/*
* finalmente se corregio , ahora a trabajar xd c-30-01-2022
* */