package me.dio.bankline.ui.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.bankline.R
import me.dio.bankline.databinding.ActivityWelcomeBinding
import me.dio.bankline.domain.Correntista
import me.dio.bankline.ui.statement.BankStatementActivity

class WelcomeActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityWelcomeBinding //Forma 2 de criar o binding

    /*
     * Forma 3 de criar o binding (mais bonita)
     */
    private val binding by lazy {
        ActivityWelcomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        binding =  ActivityWelcomeBinding.inflate(layoutInflater) //atribuindo valor para forma 2 de criar binding
//        val binding =  ActivityWelcomeBinding.inflate(layoutInflater) //Forma 1 de criar o binding

        setContentView(binding.root)

        binding.btnContinue.setOnClickListener {
            val accountHolderId = binding.editAccountHolderId.text.toString().toInt()
            val accountHolder = Correntista(accountHolderId)

            val intent = Intent(this, BankStatementActivity::class.java).apply{
                putExtra(BankStatementActivity.EXTRA_ACCOUNT_HOLDER, accountHolder)
            }
            startActivity(intent)
        }
    }
}