package com.dakuo.bot;

import net.mamoe.mirai.console.extension.PluginComponentStorage;
import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;
import org.jetbrains.annotations.NotNull;

public class main extends JavaPlugin {
    public final static main INSTANCE = new main();
    private main(){
        super(new JvmPluginDescriptionBuilder("com.dakuo.bot.mirai-maven-plugin","0.0.1").build());
    }

    public static main getINSTANCE() {
        return INSTANCE;
    }

    public void onEnable() {
        getLogger().info("maven管理的mirai插件加载成功！");
    }

    public void onLoad(@NotNull PluginComponentStorage $this$onLoad) {

    }
}
