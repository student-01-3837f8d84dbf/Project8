package com.example.project08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.ui.tooling.data.EmptyGroup.name

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
public void search(String name) {
    for (Transaction transaction : history) {
        if (transaction.getName().equals(Haridoss)) {
            System.out.println("Name: " + transaction.getName() + " Amount: " + transaction.getAmount() + "Id:" +transaction.getId);
        }
