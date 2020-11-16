package com.example.facultyprofile
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = jajanadapter(data, { onItem: datajajan ->
            onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: datajajan) {
        val showDetailActivityIntent = Intent(this, jajandetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.descDet)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<datajajan> {
        val rvList = ArrayList<datajajan>()
        rvList.add(
            datajajan(
                R.drawable.wingko,
                "JAJANAN WINGKO",
                "Wingko atau sering disebut juga Wingko Babat\n" +
                        "\n"+
                        "adalah makanan tradisional khas Indonesia.\n" +
                        "\n"+
                        "Wingko adalah sejenis kue yang terbuat dari\n" +
                        "\n"+
                        "kelapa muda, tepung, beras ketan, dan gula.\n"+
                        "\n"+
                        "Wingko sangat terkenal di pantai utara pulau Jawa",

                "Tempat Asal : Indonesia\n" +
                        "\n"+
                        "Bahan :" +
                        "1. Kelapa parut setengah tua, kukus 15 menit - 400 gram\n" +
                        "2. Gula pasir - 250 gram\n" +
                        "3. Tepung ketan putih - 150 gram\n" +
                        "4. Tepung tapioka - 50 gram\n" +
                        "5. Garam - 1/2 sdt\n" +
                        "6. Pasta vanili - 1 sdt\n" +
                        "7. Santan kental, rebus dengan daun pandan - 150 ml\n" +
                        "8. Telur, kocok lepas - 1 butir\n" +
                        "9. Minyak goreng - 1 sdm\n" +
                        "10. Margarin, untuk olesan - secukupnya"
            )
        )
        rvList.add(
            datajajan(
                R.drawable.getas,
                "JAJANAN GETAS",
                "Getas merupakan camilan khas daerah Jawa Tengah\n" +
                        "\n"+
                        "yang dibuat dari tepung ketan dan kelapa.\n" +
                        "\n"+
                        "Digoreng lalu di baluri dengan gula pasir.\n" +
                        "\n"+
                        "Ada yang bilang jajan ini adalah jajan gemblong.\n"+
                        "\n"+
                        "Biasanya banyak dijumpai di pasar-pasar Tradisional \n"+
                        "\n"+
                        "di dekat rumah. Getas sangat terkenal di pulau Jawa",

                "Tempat Asal : Indonesia\n" +
                        "\n"+
                        "Bahan :" +
                        "1. 125 gram tepung ketan putih\n" +
                        "2. 50 gram tepung beras\n" +
                        "3. 150 gram kelapa parut kasar\n" +
                        "4. 3/4 sendok teh garam\n" +
                        "5. 125 ml santan dari 1/2 butir kelapa\n" +
                        "6. minyak untuk menggoreng"
        )
        )
        rvList.add(
            datajajan(
                R.drawable.klepon,
                "JAJANAN KLEPON",
                "Klepon atau Kelepon adalah sejenis makanan \n" +
                        "\n"+
                        "tradisional atau kue tradisional Indonesia\n" +
                        "\n"+
                        "yang termasuk ke dalam kelompok jajanan\n" +
                        "\n"+
                        "pasar. Makanan enak ini terbuat dari tepung\n"+
                        "\n"+
                        "beras ketan yang dibentuk seperti bola-bola\n"+
                        "\n"+
                        "kecil dan diisi dengan gula merah lalu\n" +
                        "\n"+
                        "direbus dalam air mendidih.",

                "Tempat Asal : Indonesia\n" +
                        "\n"+
                        "Bahan :" +
                        "1. 200 gram tepung ketan putih\n" +
                        "2. 25 gram tepung sagu\n" +
                        "3. 1 sendok teh air kapur sirih\n" +
                        "4. 175 ml santan hangat (dari 1/4 butir kelapa)\n" +
                        "5. 25 ml air suji (dari 10 lembar daun suji)\n" +
                        "6. 80 gram gula merah, cacah halus untuk isian"
            )
        )

        rvList.add(
            datajajan(
                R.drawable.madumong,
                "JAJANAN MADU MONGSO",
                "Madu Mongso adalah makanan ringan asal\n" +
                        "\n"+
                        "Ponorogo. Makanan ringan ini terbuat dari\n" +
                        "\n"+
                        "ketan hitam sebagai bahann dasarnya.\n" +
                        "\n"+
                        "Rasanya asam bercampur manis karena ketan\n" +
                        "\n"+
                        "hitam sebelumnya diolah dahulu menjadi tapai.",

                "Tempat Asal : Indonesia\n" +
                        "\n"+
                        "Bahan :" +
                        "1. 1,5 kg tape ketan hitam\n" +
                        "2. 1 liter santan dari kelapa\n" +
                        "3. 300 gram gula jawa\n" +
                        "4. 2 lembar daun pandan\n" +
                        "5. Daun pisang secukupnya"

            )
        )

        rvList.add(
            datajajan(
                R.drawable.onde,
                "JAJANAN ONDE-ONDE",
                "Onde-onde atau jian dui adalah sejenis kue\n" +
                        "\n"+
                        "jajanan pasar yang populer di Indonesia. Onde-onde\n" +
                        "\n"+
                        "juga populer khususnya di daerah pecinan baik di \n" +
                        "\n"+
                        "Indonesia maupun Luar negeri",

                "Tempat Asal : Tiongkok\n" +
                        "\n"+
                        "Bahan :" +
                        "1. 500 gram tepung beras ketan\n" +
                        "2. 250 gram gula pasir\n" +
                        "3. 75 gram tepung beras\n" +
                        "4. 150 ml air hangat\n" +
                        "4. Garam secukupnya\n" +
                        "4. Vanili bubuk secukupnya\n" +
                        "4. 200 gram wijen\n" +
                        "5. Minyak goreng secukupnya"

            )
        )

        rvList.add(
            datajajan(
                R.drawable.pudak,
                "JAJANAN PUDAK",
                "Pudak adalah makanan atau kue Kabupaten Gresik\n" +
                        "\n"+
                        "Jawa Timur, Indonesia. Makanan ini terbuat\n" +
                        "\n"+
                        "dari bahan tepung beras, gula pasir/gula jawa\n" +
                        "\n"+
                        "dan santan kelapa yang dimasukkan kemasan\n"+
                        "\n"+
                        "yang disebut OPE yaitu pelepah daun pinang.\n"+
                        "\n"+
                        "Pudak juga ada yang berbahan sagu dan\n"+
                        "\n" +
                        "disebut Pudak Sagu",

                "Tempat Asal : Indonesia\n" +
                        "\n"+
                        "Bahan :" +
                        "1. 500 gram tepung beras selep\n" +
                        "2. 200 gram gula pasir\n" +
                        "3. 1/2 sendok teh vanili bubuk \n" +
                        "4. 1/4 sendok teh garam\n" +
                        "4. 100 gram sari daun pandan suji\n" +
                        "4. 1400 gram santan kelapa dari 2 butir kelapa"
            )
        )

        return rvList
    }
}
