package inc.glamdring.vtables;

import java.nio.ByteBuffer;

class �cstring implements �<CharSequence, $> {


    public CharSequence l$(�<CharSequence, $> p) {
        final $ $ = p.$r(p);
        final ByteBuffer buffer = $.l$($);
        return buffer.asCharBuffer();         

    }

    public $ $r(�<CharSequence, $> p) {
        return p.$r(this);
    }

    public �<CharSequence, $> bind(CharSequence charSequence, $ $) {
        return new �cstr();
    }

    public CharSequence reify($ void$) {
        return null;  //todo: verify for a purpose
    }
}