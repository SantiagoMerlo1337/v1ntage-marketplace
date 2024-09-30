import { SidebarLink } from "@/types";

export const sidebarLinks: SidebarLink[] = [
    {
        imgURL: "/assets/icons/diamond-xmark.svg",
        route: "/dashboard",
        label: "Dashboard",
    },
    {
        imgURL: "/assets/icons/buildings.svg",
        route: "/edificios",
        label: "Edificios",
    },
    {
        imgURL: "/assets/icons/chart-network.svg",
        route: "/p2p",
        label: "P2P",
    },
    {
        imgURL: "/assets/icons/wallet.svg",
        route: "/wallets",
        label: "Wallets",
    },
    {
        imgURL: "/assets/icons/gear.svg",
        route: "/configuracion",
        label: "Configuración",
    },
];
