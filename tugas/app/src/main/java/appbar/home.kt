package appbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.tugasrecyclerview.R
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.widget.Toolbar


class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        //atur toolbar
        setSupportActionBar(toolbar)

        //setting toolbar
        supportActionBar?.apply {
            title = "MyAldio"
            subtitle = "Mobile Developer"

            setDisplayShowCustomEnabled(true)
            setLogo(R.drawable.a)
            setDisplayUseLogoEnabled(true)
        }
    }
    //setting menu action bar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    //aksi ketika menu diklik

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var itemClicked: String = ""
        when(item.itemId){
            R.id.action_cut -> {
                itemClicked = "Cut Clicked"
            }
            R.id.action_copy -> {
                itemClicked = "Copy Clicked"
            }
            R.id.action_new -> {
                itemClicked = "New Clicked"
            }
            R.id.action_paste -> {
                itemClicked = "Paste Clicked"
            }
        }

        //Buat Snackbar sebagai aksi
        Snackbar.make(findViewById(R.id.root_layout), itemClicked, Snackbar.LENGTH_LONG)
            .setAction("Action", null).show()


        return super.onOptionsItemSelected(item)
    }
}