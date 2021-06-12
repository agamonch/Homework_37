package kg.unicapp.home37



import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment


class FragmentA: Fragment(R.layout.fragment_a) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textFromArgs = arguments?.getString("Text")
        val fragmentText = view.findViewById<TextView>(R.id.textView)
        fragmentText.text= textFromArgs
    }



    companion object {
        const val TAG = "A"
    }
}



