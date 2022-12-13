package com.bigrocket.recyclerviewkotlin

import com.bigrocket.recyclerviewkotlin.models.Profile

class DataSource {
    companion object {
        fun createDataSet() : ArrayList<Profile> {
            val list = ArrayList<Profile>()

            list.add(
                Profile(
                    "Rodaldinho",
                    "Gaucho",
                    R.drawable.ic_launcher_background
                )
            )
            list.add(
                Profile(
                    "Gabrielle",
                    "Gaucho",
                    R.drawable.ic_launcher_background
                )
            )
            list.add(
                Profile(
                    "Geovane",
                    "Gaucho",
                    R.drawable.ic_launcher_background
                )
            )
            list.add(
                Profile(
                    "Ricardo",
                    "Gaucho",
                    R.drawable.ic_launcher_background
                )
            )
            list.add(
                Profile(
                    "Bruno",
                    "Gaucho",
                    R.drawable.ic_launcher_background
                )
            )
            list.add(
                Profile(
                    "Marcelo",
                    "Gaucho",
                    R.drawable.ic_launcher_background
                )
            )
            list.add(
                Profile(
                    "Diego",
                    "Gaucho",
                    R.drawable.ic_launcher_background
                )
            )
            return list
        }
    }
}