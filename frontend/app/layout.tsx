import { LayoutProps } from "@/types";
import { Inter } from "next/font/google";
import type { Metadata } from "next";
import "./globals.css";
import { Providers } from "./providers";

export const metadata: Metadata = {
    title: "V1ntage",
    description:
        "Ultimate Next.js essential starter template for success projects",
};

const inter = Inter({
    subsets: ["latin"],
    weight: ["100", "200", "300", "400", "500", "600", "700", "800", "900"],
    variable: "--font-inter",
});

export default function RootLayout({ children }: LayoutProps) {
    return (
        <html>
            <body className={`${inter.variable}`}>
                <Providers>{children}</Providers>
            </body>
        </html>
    );
}
