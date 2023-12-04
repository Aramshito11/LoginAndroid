package com.example.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.login.databinding.FragmentUserBinding
import home

class User : Fragment() {

    var listaUsuarios = ArrayList<Usuario>()

    private lateinit var editTextUsuario: EditText
    private lateinit var editTextContrasena: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentUserBinding.inflate(inflater)

        editTextUsuario = binding.editTextText
        editTextContrasena = binding.editTextTextPassword
        val boton = binding.button

        listaUsuarios.add(Usuario("Aram","1234", "12341234W", 19))
        listaUsuarios.add(Usuario("Enaitz","1234", "44445555A", 29))
        listaUsuarios.add(Usuario("Arnau","patata", "56457843U", 5))

        boton.setOnClickListener {
            val usuario = editTextUsuario.text.toString()
            val contrasenya = editTextContrasena.text.toString()

            for (i in listaUsuarios) {
                if (i.nombreUsuario == usuario && i.contrasena == contrasenya) {
                    val bundle = Bundle()
                    bundle.putString("nom", i.nombreUsuario)
                    bundle.putString("DNI", i.dni)
                    bundle.putInt("edat", i.edat)


                    val homeFragment = home()
                    homeFragment.arguments = bundle

                    findNavController().navigate(R.id.action_user_to_home2, homeFragment.arguments)
                }
            }
            Toast.makeText(requireContext(), "Credencials incorrectes", Toast.LENGTH_SHORT)
                .show()
        }
        return binding.root
    }

}