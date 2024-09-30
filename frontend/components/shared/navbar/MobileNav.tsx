"use client";
import React from "react";

import Image from "next/image";
import Link from "next/link";
import { sidebarLinks } from "@/components/constants";
import { usePathname } from "next/navigation";
import {
    Sheet,
    SheetClose,
    SheetContent,
    SheetTrigger,
} from "@/components/ui/sheet";

const NavContent = () => {
    const pathname = usePathname();
    return (
        <section className="flex h-full flex-col gap-6 pt-16">
            {sidebarLinks.map((item) => {
                const isActive =
                    (pathname.includes(item.route) && item.route.length > 1) ||
                    pathname === item.route;
                return (
                    <SheetClose asChild key={item.route}>
                        <Link
                            href={item.route}
                            className={`${
                                isActive
                                    ? "rounded-lg bg-primary-500"
                                    : "bg-transparent"
                            } flex items-center justify-start gap-4 p-4`}
                        >
                            <Image
                                src={item.imgURL}
                                alt={item.label}
                                width={20}
                                height={20}
                                className={`icons ${isActive ? "invert" : ""}`}
                            />
                            <p className={`${isActive ? "text-white" : ""}`}>
                                {item.label}
                            </p>
                        </Link>
                    </SheetClose>
                );
            })}
        </section>
    );
};

const MobileNav = () => {
    return (
        <Sheet>
            <SheetTrigger asChild>
                <Image
                    src="/assets/icons/hamburger.svg"
                    width={36}
                    height={36}
                    alt="Menu"
                    className="invert dark:invert-0 sm:hidden"
                />
            </SheetTrigger>
            <SheetContent
                side="left"
                className="border-none bg-white dark:bg-black"
            >
                <Link href="/" className="flex items-center gap-1">
                    <Image
                        src="/assets/images/site-logo.svg"
                        width={23}
                        height={23}
                        alt="Metro Token"
                    />
                    <p className="h2-bold">
                        Metro <span className="text-primary-500">Token</span>
                    </p>
                </Link>
                <div>
                    <SheetClose asChild>
                        <NavContent />
                    </SheetClose>
                </div>
            </SheetContent>
        </Sheet>
    );
};

export default MobileNav;
