package br.com.eetepaoriximina.expoeetepa2019.helper;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class Permissao {
    public static Boolean validarPermissoes(String[] permissoes, Activity activity, int requestCode){
        if(Build.VERSION.SDK_INT >= 23){
            List<String> listaPermissao = new ArrayList<>();

            for(String permissao: permissoes){
                Boolean temPermissao = ContextCompat.checkSelfPermission(activity, permissao) == PackageManager.PERMISSION_GRANTED;
                if(!temPermissao) listaPermissao.add(permissao);

            }

            if(listaPermissao.isEmpty())return true;

            String[] novasPermissoes = new String[listaPermissao.size()];
            listaPermissao.toArray(novasPermissoes);


            ActivityCompat.requestPermissions(activity, novasPermissoes, requestCode );
        }
        return true;
    }
}
