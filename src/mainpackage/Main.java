package mainpackage;

import mainpackage.cadastroVIEW;  // Agora importa a classe do pacote "view"

public class Main {
    public static void main(String[] args) {
        cadastroVIEW cadastro = new cadastroVIEW();
        cadastro.setVisible(true);
    }
}