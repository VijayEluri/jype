package inc.glamdring.vtables;

class �cstr implements �<String,CharSequence>{

    public String l$(�<String, CharSequence> p) {
        return p.$r(p).toString();
    }

    public CharSequence $r(�<String, CharSequence> p) {
            return p.l$(p) ;  
    }

    public �<String, CharSequence> bind(final String s, final CharSequence charSequence) {
        return new �<String, CharSequence>() {
            public String l$(�<String, CharSequence> p) {
                return s;
            }

            public CharSequence $r(�<String, CharSequence> p) {
                return s;  
            }

            public �<String, CharSequence> bind(String s, CharSequence charSequence) {
                return �cstr.this.bind(s, charSequence);  
            }

            public String reify($ void$) {
                return s;  
            }
        };  //todo: verify for a purpose
    }

    public String reify($ void$) {
        return void$.l$().asCharBuffer().toString();  //todo: verify for a purpose
    }
}