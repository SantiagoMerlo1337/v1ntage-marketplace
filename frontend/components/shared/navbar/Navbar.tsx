import React from "react";
import Link from "next/link";
import MobileNav from "./MobileNav";
import UserInfo from "./UserInfo";
import ThemeSwitcher from "./ThemeSwitcher";

const Navbar = () => {
    return (
        <header>
            <nav className="flex-between shadow-slate-100 shadow-lg fixed z-50 w-full gap-5 p-3 dark:shadow-none sm:px-12">
                <Link href="/" className="flex items-center gap-1">
                    <h1 className="text-2xl font-bold">V1ntage</h1>
                </Link>

                <ThemeSwitcher />

                <UserInfo />

                <MobileNav />
            </nav>
        </header>
    );
};

export default Navbar;
