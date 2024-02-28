public class manunu {
    public static void main(String[] args) throws Exception {
        String[] menu = {"Salir", "Select", "Insert", "Delete", "Update"};
        menu_clase miMenu = new menu_clase(menu);
        miMenu.titulo = "SQL MENU";
        miMenu.setListaop(menu);
        miMenu.mostrar(miMenu.getListaop());
        miMenu.muestraLiteral(miMenu.eligeOpcion());
        }
}
