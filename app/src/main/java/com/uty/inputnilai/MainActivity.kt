    package com.uty.inputnilai

    import android.content.Intent
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.widget.EditText
    import android.widget.Toast
    import kotlinx.android.synthetic.main.activity_main.*

    class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aNim = findViewById<EditText>(R.id.aNim)
        val aNama = findViewById<EditText>(R.id.aNama)
        val aNilai = findViewById<EditText>(R.id.aNilai)


                bttn_proses.setOnClickListener(){
                    if ((aNim.text.isEmpty())||(aNama.text.isEmpty())||(aNilai.text.isEmpty())){
                        Toast.makeText(applicationContext,"Tidak Boleh Ada yang di kosongkan",Toast.LENGTH_LONG).show()

                    }else if ((aNim.text.isNotEmpty())||(aNama.text.isNotEmpty())||(aNilai.text.isNotEmpty())){
                        Toast.makeText(applicationContext,"PROSES",Toast.LENGTH_LONG).show()


                        val nim = aNim.text.toString()
                        val nama = aNama.text.toString()
                        val nilai = aNilai.text.toString()
                        var keterangan: String? = ""

                        if (nilai >= 80.toString()){
                            keterangan = "A"
                        }else if(nilai >= 60.toString()){
                            keterangan = "B"
                        }else if (nilai >= 40.toString()){
                            keterangan = "C"
                        }else if (nilai >=20.toString()){
                            keterangan = "D"
                        }else{
                            keterangan = "E"
                        }


                        val intent = Intent(this, Main2Activity::class.java)
                        intent.putExtra("Nim", nim)
                        intent.putExtra("Nama", nama)
                        intent.putExtra("Nilai", nilai)
                        intent.putExtra("Keterangan", keterangan)

                        startActivity(intent)
            }
        }

    }
}
