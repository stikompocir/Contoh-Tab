# Contoh-Tab
Sekarang Aplikasi-aplikasi android yang ada di Market sudah semakin bagus, contohnya untuk aplikasi yang menggunakan Tab, kalau dulu untuk berpindah Tab kita harus mengklik Tabnya, sekarang kita punya cara lain yaitu dengan menswipe kekanan atau kekiri. Salah satu rahasianya ternyata aplikasi tersebutb memanfaatkan View Pager. </br>
</br>
`Contoh Kode :`
```java
package com.sidiq.codelab.sampletabapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.sidiq.codelab.sampletabapplication.adapter.TabFragmentPagerAdapter;


public class MainActivity extends AppCompatActivity {
    //deklarasi semua komponen View yang akan digunakan
    private Toolbar toolbar;
    private ViewPager pager;
    private TabLayout tabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set up toolbar
        toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Material Tab");

        //inisialisasi tab dan pager
        pager = (ViewPager)findViewById(R.id.pager);
        tabs = (TabLayout)findViewById(R.id.tabs);

        //set object adapter kedalam ViewPager
        pager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));

        //Manimpilasi sedikit untuk set TextColor pada Tab
        tabs.setTabTextColors(getResources().getColor(R.color.ColorPrimaryDark),
                getResources().getColor(android.R.color.white));
        tabs.setSmoothScrollingEnabled(true);
        tabs.setFillViewport(true);
        //set tab ke ViewPager
        tabs.setupWithViewPager(pager);

        //konfigurasi Gravity Fill untuk Tab berada di posisi yang proposional
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
```
Screen Shot
-----------
|  | |
|-------|------|
| ![Demo Screen Shot][1] | ![Demo Screen Shot][2] |


[1]: https://github.com/stikompocir/Contoh-Tab/blob/master/Screenshot_2016-09-04-23-52-13-70.png
[2]: https://github.com/stikompocir/Contoh-Tab/blob/master/Screenshot_2016-09-04-23-52-24-24.png
