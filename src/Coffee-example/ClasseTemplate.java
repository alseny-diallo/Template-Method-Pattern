abstract class ClasseTemplate{

    public final void templateMethode() {
        mettreEau();
        mettreCafe();
        preparerCafe();
        servirCafe();
    }

    protected abstract void mettreEau();

    protected abstract void mettreCafe();

    private void preparerCafe(){
       System.out.println("Chaufer l'eau");
       System.out.println("Mettre le café dans l'eau");
       System.out.println("Melanger le café et l'eau");
    }

    private void servirCafe(){
        System.out.println("Mettre le café dans la tasse");
    }

}