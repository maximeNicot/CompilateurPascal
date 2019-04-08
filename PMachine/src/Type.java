public interface Type {
    public int size();

    public static class Int implements Type{
        public int size() {
            return 1;
        }
    }

    public static class Boolean implements Type{
        public int size(){
            return 1;
        }
    }

    public static class Tab implements Type{
        int taille;
        Type type;
        public int size(){
            return taille * type.size();
        }
    }

    public static class Record implements Type{
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
