public interface Type {
    public int size();

    public static class MyInt implements Type{
        public int size() {
            return 1;
        }
    }

    public static class MyBoolean implements Type{
        public int size(){
            return 1;
        }
    }

    public static class MyTab implements Type{
        int taille;



        Type type;

        public MyTab(int taille, Type type) {
            this.taille = taille;
            this.type = type;
        }

        public int size(){
            return taille * type.size();
        }
        public Type getType() {
            return type;
        }
    }

    public static class MyRecord implements Type{
        int taille = 0;
        Type[] types;

        public int size(){
            for (Type type : types){
                taille += type.size();
            }
            return taille;
        }

    }

}
