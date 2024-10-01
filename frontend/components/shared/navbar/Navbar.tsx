import React from "react";
import Link from "next/link";
import MobileNav from "./MobileNav";
import UserInfo from "./UserInfo";
import ThemeSwitcher from "./ThemeSwitcher";
import { Input } from "@/components/ui/input";

const Navbar = () => {
    return (
        <header>
            <nav className="flex-between shadow-slate-100 shadow-lg z-50 w-full gap-5 p-3 dark:shadow-none sm:px-12">
                <Link href="/" className="flex items-center gap-1">
                    <h1 className="text-2xl font-bold">V1ntage</h1>
                </Link>

                <Input className="w-[450px]" placeholder="Search anything"/>

                <div className="flex gap-8">
                    <ThemeSwitcher />
                    <UserInfo />
                </div>

                <MobileNav />
            </nav>
        </header>
    );
};

export default Navbar;
