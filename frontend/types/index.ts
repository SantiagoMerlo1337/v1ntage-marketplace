//Types and interfaces needed for components/pages

export interface LayoutProps {
    children: React.ReactNode;
}

export interface SearchParamsProps {
    searchParams: { [key: string]: string | undefined };
}

export interface UrlQueryParams {
    params: string;
    key: string;
    value: string | null;
}

export interface RemoveUrlQueryParams {
    params: string;
    keysToRemove: string[];
}

export interface SidebarLink {
    imgURL: string;
    route: string;
    label: string;
}
