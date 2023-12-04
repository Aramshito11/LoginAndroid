import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.login.databinding.FragmentHomeBinding
import com.example.login.databinding.FragmentUserBinding

class home : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentHomeBinding.inflate(inflater)

        val nom = arguments?.getString("nom")
        val dni = arguments?.getString("DNI")
        val edat = arguments?.getInt("edat")

        binding.nom.text = nom.toString()
        binding.dni.text = dni.toString()
        binding.edat.text = edat.toString()

        return binding.root
    }

}