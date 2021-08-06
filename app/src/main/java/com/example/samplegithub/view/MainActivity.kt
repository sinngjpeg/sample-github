package com.example.samplegithub.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.samplegithub.R
import com.example.samplegithub.utils.StringUtils.JAVA_TAG
import com.example.samplegithub.utils.StringUtils.KOTLIN_TAG
import com.example.samplegithub.databinding.ActivityMainBinding
import com.example.samplegithub.fragment.RepositoryJavaFragment
import com.example.samplegithub.fragment.RepositoryKotlinFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layoutInflate()
        setContentView(binding.root)
        setFragment(RepositoryJavaFragment(), JAVA_TAG)
        setUpBottomNavigation()
    }

    private fun layoutInflate() {
        binding = ActivityMainBinding.inflate(layoutInflater)
    }

    private fun setFragment(fragment: Fragment, tag: String) {
        supportFragmentManager
            .beginTransaction()
            .replace(
                R.id.main_view_fragment_holder,
                fragment,
                tag
            ).commit()
    }

    private fun setUpBottomNavigation() {
        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            onNavigationItemSelected(it)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.layout.fragment_repository_java -> {
                setFragment(RepositoryJavaFragment(), JAVA_TAG)
                true
            }

            R.layout.fragment_repository_kotlin -> {
                setFragment(RepositoryKotlinFragment(), KOTLIN_TAG)
                true
            }
            else -> false
        }
    }

}