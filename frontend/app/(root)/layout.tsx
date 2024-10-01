import React from "react";
import Navbar from "@/components/shared/navbar/Navbar";
import Footer from "@/components/shared/Footer";

const Layout = ({ children }: { children: React.ReactNode }) => {
    return (
        <div className="min-h-dvh grid grid-rows-[auto,1fr,auto]">
            <Navbar />
            <main className="container mt-10">
                {children}
                {/* <div className="flex">
                    <section className="flex min-h-screen flex-1 flex-col px-6 pb-6 pt-36 max-md:pb-14 sm:px-14">
                        <div className="mx-auto w-full max-w-5xl">
                            {children}
                        </div>
                    </section>
                </div> */}
            </main>
            <Footer />
        </div>
    );
};

export default Layout;
