package com.example.facultyprofile
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detailjajan.*
import kotlinx.android.synthetic.main.detailjajan.*
import kotlinx.android.synthetic.main.detailjajan.*

class jajandetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailjajan)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var imgF = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var nameF =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskF =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var deskS =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)
            image_detail.setImageResource(imgF)
            tv_name_detail.text = nameF
            tv_desc_detail.text = deskF
            tv_short_detail.text = deskS
        }
    }
}
