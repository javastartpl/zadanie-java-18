public class ArrayComparator {
    public boolean compare(int[][] tab1, int[][] tab2) {
        //jeśli któryś z argumentów jest nullerm, a drugi nie, to nie są równe
        if(tab1 == null && tab2 != null || tab1 != null && tab2 == null)
            return false;
        //jeśli oba są nullami, to są równe
        if(tab1 == null && tab2 == null)
            return true;
        //jeśli ilosć "wierszy" (tablic wewnętrznych) nie jest równa, to tablice nie są równe
        if(tab1.length != tab2.length)
            return false;
        for (int i = 0; i < tab1.length; i++) {
            //jeśli ilość "kolumn", w którymś wierszu jest różna, to tablice nie są równe
            if(tab1[i].length != tab2[i].length)
                return false;
            for (int j = 0; j < tab1[i].length; j++) {
                //jeśli którykolwiek element się różni, to tablice nie są równe
                if(tab1[i][j] != tab2[i][j])
                    return false;
            }
        }
        //jeśli wszystko przeszło, to tablice są równe
        return true;
    }
}
