#include "libcst.glh"

#ifdef _FRAGMENT_

void main() {
    out_color = vec4(get_sun_height_map(get_surface_point()));
}

#endif
