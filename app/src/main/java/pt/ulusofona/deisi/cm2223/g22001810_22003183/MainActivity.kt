package pt.ulusofona.deisi.cm2223.g22001810_22003183

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import pt.ulusofona.deisi.cm2223.g22001810_22003183.databinding.ActivityMainBinding


private val dashboard = DashboardFragment()
private val registar = RegistarFragment()
private val listar = ListarFragment()

class MainActivity : AppCompatActivity() {

    private lateinit var  binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        replaceFragment(dashboard)

        binding.bottomNavigationBar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.Dashboard -> replaceFragment(dashboard)

                R.id.Registar -> replaceFragment(registar)

                R.id.Lista -> replaceFragment(listar)

                else -> {

                }
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout, fragment)
        transaction.commit()
    }
}
