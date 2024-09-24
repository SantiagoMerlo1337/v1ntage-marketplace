"use client";

import { useTheme } from "next-themes";
import { Switch } from "../ui/switch";
import { useEffect, useState } from "react";
import { Moon, Sun } from "lucide-react";

export default function ThemeSwitcher() {
    const { theme, setTheme } = useTheme();
    const [localTheme, setLocalTheme] = useState("light");

    useEffect(() => {
        setLocalTheme(theme as string);
    }, [theme]);

    const handleThemeChange = () => {
        if (localTheme === "light") {
            setTheme("dark");
            setLocalTheme("dark");
        } else {
            setTheme("light");
            setLocalTheme("light");
        }
    };

    return (
        <div className="w-fit flex items-center gap-2">
            <div className="flex justify-center">
                <Sun className="h-[1.2rem] w-[1.2rem] rotate-0 scale-100 transition-all dark:-rotate-90 dark:scale-0" />
                <Moon className="absolute h-[1.2rem] w-[1.2rem] rotate-90 scale-0 transition-all dark:rotate-0 dark:scale-100" />
            </div>
            <Switch onClick={handleThemeChange} />
        </div>
    );
}
