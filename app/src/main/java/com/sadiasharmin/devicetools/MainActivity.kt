package com.sadiasharmin.devicetools

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import android.support.v4.app.Fragment
import com.sadiasharmin.devicetools.fragment.DeviceFragment
import com.sadiasharmin.devicetools.fragment.OsFragment


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


/*
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }*/

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)




    }

    fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.device, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_Device -> {
                val deviceFragment = DeviceFragment.newInstance("", "")
                openFragment(deviceFragment)
            }
            R.id.nav_OS-> {
                val osFragment = OsFragment.newInstance("", "")
                openFragment(osFragment)

            }
            R.id.nav_CPU -> {

            }
            R.id.nav_Battery -> {

            } R.id.nav_Storage -> {

            }R.id.nav_Network -> {

            }R.id.nav_Sensor -> {

            }R.id.nav_Camera -> {

            }R.id.nav_Feature -> {

            }R.id.nav_UserApps -> {

            }R.id.nav_SystemsApps -> {

            }R.id.nav_AboutUS -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_RateUs -> {

            }R.id.nav_Feedback -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
