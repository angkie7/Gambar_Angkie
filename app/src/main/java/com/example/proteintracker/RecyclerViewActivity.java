package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proteintracker.Adapter.MahasiswaAdapter;
import com.example.proteintracker.Model.Mahasiswa;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter mahasiswaAdapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_recycler_view);
        addData();
        recyclerView = findViewById(R.id.rvMassiswa);
        mahasiswaAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(RecyclerViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Denis Kempot",
                "141", "123"));
        mahasiswaArrayList.add(new Mahasiswa("Etik Kiki",
                "121", "987"));
        mahasiswaArrayList.add(new Mahasiswa("Kiki Lala",
                "155", "984"));
        mahasiswaArrayList.add(new Mahasiswa("Lala Kiki", "190",
                "010"));
        mahasiswaArrayList.add(new Mahasiswa("Koko Lolo",
                "141", "122"));
        mahasiswaArrayList.add(new Mahasiswa("Klol oapoa",
                "126", "997"));
        mahasiswaArrayList.add(new Mahasiswa("Popo Ipip",
                "758", "789"));
        mahasiswaArrayList.add(new Mahasiswa("DIDI jiJi",
                "125", "758"));
        mahasiswaArrayList.add(new Mahasiswa("Koko Lopa",
                "130", "968"));
        mahasiswaArrayList.add(new Mahasiswa("Jiji kolo",
                "389", "079"));
        mahasiswaArrayList.add(new Mahasiswa("Asii Papaa",
                "345", "764"));
        mahasiswaArrayList.add(new Mahasiswa("Kaja Aluc",
                "278", "024"));
    }
}
