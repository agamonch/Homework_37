package kg.unicapp.home37

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setupView()

    }

    private fun setupView() {
        val textFromEdit = intent.getStringExtra("Text")

        val fragment = FragmentA()
        val args = Bundle()
        args.putString("Text", textFromEdit)
        fragment.arguments = args

        supportFragmentManager
            .beginTransaction()
            .add(R.id.container, fragment, FragmentA.TAG)
            .commit()



    }


}