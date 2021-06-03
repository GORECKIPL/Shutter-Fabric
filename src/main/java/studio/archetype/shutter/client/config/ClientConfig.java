package studio.archetype.shutter.client.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;
import studio.archetype.shutter.Shutter;
import studio.archetype.shutter.client.config.enums.*;

@Config(name = Shutter.MOD_ID)
public class ClientConfig implements ConfigData {

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
    public NotificationTarget notificationTarget = NotificationTarget.TOAST;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.Gui.CollapsibleObject
    public final PathGenerationSettings genSettings = new PathGenerationSettings();

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.Gui.CollapsibleObject
    public final CameraPathSettings pathSettings = new CameraPathSettings();

    public static class CameraPathSettings {

        @ConfigEntry.Gui.Tooltip
        public boolean showNodeHead = false;

        @ConfigEntry.Gui.Tooltip
        @ConfigEntry.BoundedDiscrete(max = 100, min = 0)
        public int nodeTransparency = 50;

        @ConfigEntry.Gui.Tooltip
        public boolean showDirectionalBeam = false;

        @ConfigEntry.Gui.Tooltip
        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
        public PathStyle pathStyle = PathStyle.LINE;

        @ConfigEntry.Gui.Tooltip
        @ConfigEntry.ColorPicker
        public int pathColour = 0;
    }

    public static class PathGenerationSettings {

        @ConfigEntry.Gui.Tooltip
        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
        public PathDetail curveDetail = PathDetail.LOW;

        @ConfigEntry.Gui.Tooltip
        public double pathTime = 100;

        @ConfigEntry.Gui.Tooltip
        public boolean hideUi = false;

        @ConfigEntry.Gui.Tooltip
        public boolean hideArmorStands = true;

        @ConfigEntry.Gui.Tooltip
        public boolean hideEntityLabels = false;
    }
}
