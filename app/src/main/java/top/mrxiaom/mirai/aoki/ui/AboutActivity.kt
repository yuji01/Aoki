package top.mrxiaom.mirai.aoki.ui

import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import androidx.appcompat.app.AppCompatActivity
import top.mrxiaom.mirai.aoki.R
import top.mrxiaom.mirai.aoki.databinding.ActivityAboutBinding
import top.mrxiaom.mirai.aoki.util.text

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.apply {
            text = Html.fromHtml(text(R.string.about_body), 0)
            movementMethod = LinkMovementMethod.getInstance()
        }
    }
}