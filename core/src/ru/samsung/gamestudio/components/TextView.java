package ru.samsung.gamestudio.components;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TextView extends View{

    private BitmapFont font;
    private String text;

    public TextView(BitmapFont font, float x, float y) {
        super(x, y, 0, 0);
        this.font = font;
        this.x = x;
        this.y = y;
    }

    public TextView(BitmapFont font, float x, float y, String text) {
        this(font, x, y);
        this.text = text;

        GlyphLayout glyphLayout = new GlyphLayout(font, text);
        width = glyphLayout.width;
        height = glyphLayout.height;
    }

    public void setText(String text) {
        this.text = text;
        GlyphLayout glyphLayout = new GlyphLayout(font, text);
        width = glyphLayout.width;
        height = glyphLayout.height;
    }

    @Override
    public void draw(SpriteBatch batch) {
        font.draw(batch, text, x, y + height);
    }

    @Override
    public void dispose() {
        font.dispose();
    }

}