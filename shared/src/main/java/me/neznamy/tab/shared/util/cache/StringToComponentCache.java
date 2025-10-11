package me.neznamy.tab.shared.util.cache;

import me.neznamy.tab.shared.chat.TabTextColor;
import me.neznamy.tab.shared.chat.component.TabComponent;
import me.neznamy.tab.shared.chat.component.TabTextComponent;
import me.neznamy.tab.shared.chat.rgb.RGBUtils;
import me.neznamy.tab.shared.util.function.TriFunction;
import me.neznamy.tab.shared.hook.MiniMessageHook;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Cache for String → TabComponent conversion.
 */
public class StringToComponentCache extends Cache<String, TabComponent> {
    /**
     * Constructs new instance with given parameters.
     *
     * @param   name
     *          Cache name
     * @param   cacheSize
     *          Size limit of the cache
     */
    public StringToComponentCache(String name, int cacheSize) {
        super(name, cacheSize);
    }

    @NotNull
    @Override
    public TabComponent convert(@NotNull String text) {
        return new TabTextComponent(text, new ArrayList<>());
    }
}
