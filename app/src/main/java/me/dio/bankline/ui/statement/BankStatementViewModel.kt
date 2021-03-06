package me.dio.bankline.ui.statement

import androidx.lifecycle.ViewModel
import me.dio.bankline.data.BanklineRepository

class BankStatementViewModel : ViewModel() {

    fun finBankStatement(accountHolderId : Int) =
        BanklineRepository.findBankStatement(accountHolderId)
}