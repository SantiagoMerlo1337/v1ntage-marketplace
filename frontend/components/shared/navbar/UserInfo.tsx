"use client";
import { Button } from "@/components/ui/button";
import { signIn, signOut, useSession } from "next-auth/react";
import Image from "next/image";
import {
    DropdownMenu,
    DropdownMenuContent,
    DropdownMenuItem,
    DropdownMenuLabel,
    DropdownMenuSeparator,
    DropdownMenuTrigger,
} from "@/components/ui/dropdown-menu";

const UserInfo = () => {
    const { data: session } = useSession();
    return (
        <div>
            {session?.user ? (
                <div>
                    <DropdownMenu>
                        <DropdownMenuTrigger>
                            <div className="flex gap-2 items-center">
                                {session.user.name}
                                <Image
                                    src={session.user.image as string}
                                    width={28}
                                    height={28}
                                    alt={`${session.user.name} avatar`}
                                    className="rounded-full"
                                ></Image>
                            </div>
                        </DropdownMenuTrigger>
                        <DropdownMenuContent>
                            <DropdownMenuLabel>My Account</DropdownMenuLabel>
                            <DropdownMenuSeparator />
                            <DropdownMenuItem>Profile</DropdownMenuItem>
                            <DropdownMenuItem>Billing</DropdownMenuItem>
                            <DropdownMenuItem>Team</DropdownMenuItem>
                            <DropdownMenuSeparator />
                            <DropdownMenuItem>
                                <Button
                                    className="w-full "
                                    onClick={() => signOut()}
                                >
                                    Logout
                                </Button>
                            </DropdownMenuItem>
                        </DropdownMenuContent>
                    </DropdownMenu>
                </div>
            ) : (
                <Button className="w-full" onClick={() => signIn()}>
                    Sign In
                </Button>
            )}
        </div>
    );
};

export default UserInfo;
