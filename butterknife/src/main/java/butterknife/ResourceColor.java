package butterknife;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Bind a field to the specified color resource ID. Type can be {@code int} or
 * {@link android.content.res.ColorStateList}.
 * <pre><code>
 * {@literal @}ResourceColor(R.color.background_green) int green;
 * {@literal @}ResourceColor(R.color.background_green_selector) ColorStateList greenSelector;
 * </code></pre>
 */
@Retention(CLASS) @Target(FIELD)
public @interface ResourceColor {
  /** Color resource ID to which the field will be bound. */
  int value();
}
