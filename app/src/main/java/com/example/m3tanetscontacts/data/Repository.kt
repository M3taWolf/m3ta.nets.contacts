package com.example.m3tanetscontacts.data

import com.example.m3tanetscontacts.R
import com.example.m3tanetscontacts.data.model.Contacts

class Repository {
    fun loadContacts(): MutableList<Contacts> {
        return mutableListOf(
            Contacts(
                R.drawable.contact1,
                R.drawable.contact1full,
                "4BBY R0B3RTS",
                "333444555",
                "abby.r0b3rts@m3ta.nets.com",
                mutableListOf()
            ),
            Contacts(
                R.drawable.contact2,
                R.drawable.contact2full,
                "K1M P3TRAS",
                "222333444",
                "k1m.p3tras@m3ta.nets.com",
                mutableListOf()
            ),
            Contacts(
                R.drawable.contact3,
                R.drawable.contact3full,
                "AVA MAXX",
                "111222333",
                "ava.maxx@m3ta.nets.com",
                mutableListOf()
            ),
            Contacts(
                R.drawable.contact4,
                R.drawable.contact4full,
                "CHAS3 HUDS0N",
                "555666777",
                "chas3.huds0n@m3ta.nets.com",
                mutableListOf()
            ),
            Contacts(
                R.drawable.contact5,
                R.drawable.contact5full,
                "P3ACH PRC",
                "666777888",
                "p3ach.prc@m3ta.nets.com",
                mutableListOf()
            ),
            Contacts(
                R.drawable.contact6,
                R.drawable.contact6full,
                "K1DD K3NN",
                "777888999",
                "k1d.k3nn@m3ta.n3ts.com",
                mutableListOf()
            ),
            Contacts(
                R.drawable.contact7,
                R.drawable.contact7full,
                "AU RA",
                "999222444",
                "au.ra@m3ta.nets.com",
                mutableListOf()
            ),
            Contacts(
                R.drawable.contact8,
                R.drawable.contact8full,
                "A5H N1KK0",
                "888444222",
                "ash.nikk0@m3ta.nets.com",
                mutableListOf()
            ),
            Contacts(
                R.drawable.contact9,
                R.drawable.contact9full,
                "1ANN D10R",
                "222444888",
                "1ann.d10r@m3ta.nets.com",
                mutableListOf()
            )
        )
    }
}