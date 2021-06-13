package kg.unicapp.home37

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
    }

    private fun setupView() {

        val edittext = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            if(edittext.length()>0) {
                val intent1 = Intent(this, MainActivity2::class.java)
                intent1.putExtra("Text", edittext.text.toString())
                startActivity(intent1)
            }
            else{
                Toast.makeText(this, "Edittext is EMPTY", Toast.LENGTH_LONG).show()
                }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.action_settings ->  Toast.makeText(this, "Нечего настраивать", Toast.LENGTH_SHORT).show()
            R.id.about_app -> Toast.makeText(this, "Это мое приложение", Toast.LENGTH_SHORT).show()
            R.id.add_something -> Toast.makeText(this, "Позже добавите", Toast.LENGTH_SHORT).show()
            R.id.close_app -> finish()
        }
        return true
    }
}