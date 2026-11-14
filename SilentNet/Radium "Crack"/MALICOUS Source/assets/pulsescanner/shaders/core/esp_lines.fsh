#version 330

// Fog-free line fragment shader (see esp_lines.vsh).
#moj_import <minecraft:fog.glsl>
#moj_import <minecraft:dynamictransforms.glsl>

in vec4 vertexColor;

out vec4 fragColor;

void main() {
    vec4 color = vertexColor * ColorModulator;
    if (color.a == 0.0) {
        discard;
    }
    fragColor = color;
}
